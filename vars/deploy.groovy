def call(){
echo 'Deploying the code'
sh "docker rm notesapp-cont -f "
// sh 'docker run -d -p 8000:8000 --name notesapp-cont notesapp:latest'
sh "docker compose up -d"

}
