def call() {
  node {

      stage('app-dependencies') {
          sh 'echo OK'
      }

    if("${BRANCH_NAME}" == "main") {
      stage('build-container-image') {
        sh 'echo OK'
      }

      stage('push-to-image-registry') {
        sh 'echo OK'
      }
    } else if("${BRANCH_NAME}" =~ "PR-.*") {
      stage('Code Quality') {
        sh 'echo OK'
      }
      stage('unit-tests') {
        sh 'echo OK'
      }
    } else {
      stage('unit-tests') {
        sh 'echo OK'
      }
    }

    }

}