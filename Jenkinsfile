pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage('Build Maven') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '5e4f0fcf-0a3e-4ea3-bb61-fe7746c27acc', url: 'https://github.com/Ratna1992/boot-jenkins-docker']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker'){
            steps {
                script {
                    bat 'docker build -t kingratna1992/boot-jenkins-docker .' 
                }
            }
        }
        
        stage('Push image to hub'){
            steps{
                  script {
                       bat 'docker login -u kingratna1992 -p LordShiva@2027'
                       bat 'docker push kingratna1992/boot-jenkins-docker'
                  }
            }
        }
    }
}
