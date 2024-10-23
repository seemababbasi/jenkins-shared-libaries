def call(String ProjectName, String ImageTag, String dockerHubUser){
  echo 'Pushing the code to Dockerhub'
                withCredentials([usernamePassword(
                'credentialsId':"dockerHubCred",
                usernameVariable:"dockerHubUser",
                passwordVariable:"dockerHubPassword")]){
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPassword} "
  sh "docker image tag  ${ProjectName}:${ImageTag}  ${dockerHubUser}/${ProjectName}:${ImageTag}"
  sh "docker push ${dockerHubUser}/${ProjectName}:{ImageTag}"
                }
}
