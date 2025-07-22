def call(String Project,String ImageTag,String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker-hub-cred',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS')]) {
                    sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                }
      sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
