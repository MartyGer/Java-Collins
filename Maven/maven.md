# MAVEN (Maven - Maven project structure and maven build commands)

i) What is Maven?\
Maven is a build tool which helps us in building java programs. It will automatically download the dependencies we require for a Java program and then complies it into the files that we specify (such as jar, ear, zip etc.). It creates a pom.xml file which contains the following:
a) Group ID\
b) Artifact ID\
c) Version

ii) Maven Project Structure:\
src\main\java\
src\main\resourses\
src\test\java\
src\test\resourses\
target\
pom.xml

iii) Maven Commands:
a) mvn --version\
b) mvn install\
c) mvn compile\
d) mvn clean \
e) mvn eclipse:eclipse // For Eclipse IDE\
f) mvn idea:idea // For Intellij IDE\
g) mvn archetype:generate\
h) mvn package