pipeline { 
    agent any 
    stages {
        stage ('Pull'){
        steps {

    }
    stages {
        stage('Build') { 
            steps { 
                echo 'build successful' 
            }
        }
        stage('Test'){
            steps {
                echo 'test successful' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploy successful'
            }
        }
    }
}