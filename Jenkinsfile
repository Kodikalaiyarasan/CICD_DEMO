pipeline {

    agent any

    tools {
        jdk '24'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Kodikalaiyarasan/CICD_DEMO.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Docker Build') {

            steps {

                bat 'docker build -t ci-cd-demo .'

            }

        }

        stage('Deploy') {

            steps {

                bat 'docker stop ci-cd-demo || exit 0'
                bat 'docker rm ci-cd-demo || exit 0'

                bat 'docker run -d --name ci-cd-demo -p 8081:9090 ci-cd-demo'

            }

        }
    }

    post {

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }

        always {
           junit testResults: '**/target/surefire-reports/*.xml',
                 allowEmptyResults: true
        }
    }
}