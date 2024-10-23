def call(){
            echo 'I am cloning the code'
            git url: "https://github.com/seemababbasi/django-notes-app.git", branch: "main"
            echo "cloining the code successfully"
}
