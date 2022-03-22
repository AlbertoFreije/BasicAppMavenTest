pipeline {
    agent any
    tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
                sh 'java -jar target/gs-maven-0.1.0.jar'
            }
        }
        stage('build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
                sh 'java -jar target/gs-maven-0.1.0.jar'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
