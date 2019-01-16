pipeline {
    agent {
        // 此处设定构建环境，目前可选有
        // java-8,python-2.7,python-3.5,build-essential,ruby-2.3,go-1.7
        label "java-8"
    }
    stages  {
        
        stage("检出") {
            steps {
                sh 'ci-init'
                checkout(
                  [$class: 'GitSCM', branches: [[name: env.GIT_BUILD_REF]], 
                  userRemoteConfigs: [[url: env.GIT_REPO_URL]]]
                )
            }
        }

        stage("测试") {
            steps {
                //sh "apt-get update"
                //sh "apt-get install automake pkg-config build-essential libcurl4-openssl-dev libjson-c-dev -y"
              	sh "mvn test"
            }
        }
        
        stage("编译") {
            steps {
                sh "mvn package"
                //sh "./configure"
                //sh "make"
            }
        }
		
        stage("保存构建产物") {
            steps {
                archiveArtifacts artifacts: 'target/java-project-0.0.1-SNAPSHOT.jar', fingerprint: true
              	sh "ls -l target/*.jar"
            }
        }
    }
}
