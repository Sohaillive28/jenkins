pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }    
        }
        stage('Goodbye') {
            steps {
                echo 'Goodbye'
            }
        }
        stage('pwshell') {
            steps {
                powershell 'Write-Output "Hello world"'
            }
        }
        
    }
}