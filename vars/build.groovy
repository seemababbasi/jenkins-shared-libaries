def call(){
   echo "building the code in docker"
   sh "docker build -t notesapp:latest ."
}
