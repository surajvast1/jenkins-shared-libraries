def call(String Projectname,String ImageTag,String Dockerhubuser)
{
  echo "This is building the code"
  sh "docker build -t ${Dockerhubuser}/${Projectname}:${ImageTag} ."
  echo "Code building success"
}
