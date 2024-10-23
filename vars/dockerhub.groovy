def call(){
  echo 'Pushing the code to Dockerhub'
                withCredentials([usernamePassword(
                'credentialsId':"dockerHubCred",
                usernameVariable:"dockerHubUser",
                passwordVariable:"dockerHubPassword")]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword} "
  sh "docker image tag notesapp:latest ${env.dockerHubUser}/notes-app:latest"
  sh "docker push ${env.dockerHubUser}/notes-app:latest"
