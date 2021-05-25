# hellojava1: demo of junit , no spring

mvn clean package -DskipTests

PS C:\hellojava1> mvn clean package
	Running com.unistar.MyStackTest
	Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.168 sec

PS C:\hellojava1> mvn -Dtest=MyStackTest test
	Running com.unistar.MyStackTest
	Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.163 sec

PS C:\hellojava1> mvn -Dtest=MyStackTest#verifyPush test
	Running com.unistar.MyStackTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.1 sec

; when mainClass is not defined in pom.xml
java -cp target/hellojava1-1.0-SNAPSHOT.jar com.unistar.mainapp

; when mainClass is defined in pom.xml
java -jar target/hellojava1-1.0-SNAPSHOT.jar

## Output
Hello World!
pushed : [1, 2, 3]
stack.size() : 3
 3
 2
 1
