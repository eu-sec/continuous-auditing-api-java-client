#!/bin/bash
# NOTE: for new releases, please adjust the version
VERSION=1.0.7

# download specific yaml file
wget https://raw.githubusercontent.com/eu-sec/continuous-auditing-api-spec/$VERSION/swagger.yaml -O eu-sec-$VERSION.yaml

# seems to be necessary, otherwise the files are not properly regenerated
rm -rf README.md build.gradle src

# go
swagger-codegen generate \
    -i eu-sec-$VERSION.yaml \
    -l java \
    --model-package=eu.sec.cert.model \
    --api-package=eu.sec.cert.api \
    --artifact-version=$VERSION \
    --artifact-id=continuous-auditing-api-java-client \
    --group-id=eu.sec.cert \
    --git-repo-id=continuous-auditing-api-java-client \
    --git-user-id=eu-sec -o .

# remove maven, sbt, we only need gradle
rm pom.xml build.sbt

# update gradle to more recent version
gradle wrapper

# update git ignore
cat <<EOF >> .gitignore

# additional files
.DS_STORE
.project
.settings
.classpath
.vscode
eu-sec-*.yaml
.idea
EOF

grep -B 100000  'io.swagger:swagger-annotations:' build.gradle | cat - <(echo "    compile 'javax.annotation:javax.annotation-api:1.3.2'") <(grep -A 100000  io.swagger:swagger-annotations: build.gradle) > build.gradle.tmp
mv build.gradle.tmp build.gradle
