@Library('Jenkinsfiles@master')
import com.sample.pipeline.ComponentPipeline
new ComponentPipeline(this).invoke()

//node {
//        stage('Checkout') {
//                checkout scm
//        }
//        stage('Build') {
//                sh 'gradle clean build'
//        }
//        stage('Test') {
//                sh 'gradle test'
//        }
//        stage('Package') {
//                sh 'gradle jar'
//        }
//}
