pipeline {
    agent any

    parameters {
        string(name: 'VERSION', defaultValue: '1.0.0', description: 'Build Version')
    }

    stages {
        stage('Build') {
            steps {
                //echo 'Building version ${parameters.VERSION}'
                echo 'Building Project...'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                //echo 'Testing version ${parameters.VERSION}'
                echo 'Testing Project...'
                sh './gradlew test || exit 1'
            }
        }


    }

    post {
//                 always {
//                     junit "build/reports/tests/**/*.html"
//                 }

        success {
            echo 'Pipeline succeeded!'
        }

        failure {
            echo 'Pipeline failed.'
        }

        unstable {
            echo 'Pipeline is unstable. Some tests failed.'
        }

//         always {
//             echo 'Pipeline finished. Performing cleanup and test result processing.'
//             junit '**/build/test-results/**/*.xml' // Adjust this path if necessary
//         }
    }
}