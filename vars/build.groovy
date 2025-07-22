def call(String Projectname,String ImageTag,String Dockerhubuser)
{
  sh "docker build -t ${Dockerhubuser}/${Projectname}:${ImageTag} ."
}
