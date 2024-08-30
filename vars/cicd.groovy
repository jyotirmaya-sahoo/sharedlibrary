

def gitdownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenbuild
{
    sh 'mvn package'
}

