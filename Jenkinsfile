pipeline {
    agent any
    tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }
    stages {
          stage("Code Quality Check via SonarQube") {
            steps {
                script{
                    def scannerHome = tool 'sonarqube';
                    withSonarQubeEnv("sonarqube-container") {
                        sh "${tool("sonarqube")}/bin/sonar-scanner \
                        -Dsonar.projectKey=test-node-js \
                        -Dsonar.sources=. \
                        -Dsonar.css.node=. \
                        -Dsonar.host.url=http://192.168.56.10:9000 \
                        -Dsonar.login=your-generated-token-from-sonarqube-container"
                    }
                }
            }
          }
          stage("Install Project Dependencies") {
            steps {
              nodejs(nodeJSInstallationName: 'nodenv'){
                sh "npm install"
              }
            }
        }
    }
    
}
