node {
        stage('Checkout') {
                checkout scm
        }
        stage('Build') {
                sh 'gradle clean build'
        }
        stage('Test') {
                sh 'gradle test'
        }
        stage('Package') {
                sh 'gradle jar'
        }
}
