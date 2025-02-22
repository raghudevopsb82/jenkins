def call() {
  pipeline {
    agent any

    stages {

      stage('app-dependencies') {
        steps {
          sh 'echo OK'
        }
      }

      stage('Code Quality') {
        steps {
          sh 'echo OK'
        }
      }

      stage('unit-tests') {
        steps {
          sh 'echo OK'
        }
      }

      stage('build-container-image') {
        steps {
          sh 'echo OK'
        }
      }

      stage('push-to-image-registry') {
        steps {
          sh 'echo OK'
        }
      }

    }
  }



}