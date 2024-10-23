def call(String ProjectName, String ImageTage, String DockerHubUser ){
   echo "building the code in docker"
   sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTage} ."
}
