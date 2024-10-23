def call(String url, String branch){
            echo 'I am cloning the code'
            git url: "${url}", branch: "${branch}"
            echo "cloining the code successfully"
            //https://github.com/seemababbasi/django-notes-app.git
}
