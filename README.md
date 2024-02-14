Mochammad Ezar Yudha
2206046746

<h1>Tutorial 1</h1>

<h3>Reflection 1</h3>
Some clean code principles I used in this project are meaningful names, functions, and self-describing code. The source 
code of this project is split into layers, with each layer having its own unique purpose. This compartmentalization of 
code helps the viewer to navigate through the project more easily. As for the secure coding principles, I included tests
to validate whether the methods I made work as intended. Going back to the idea of clean code, I seperated the tests from
the main files for better readability. An issue with this project is the lack of authorization or authentication features
which could pose possible security risks.

<h3>Reflection 2</h3>


Although I'm disappointed that I couldn't finish the exercises, I learned a lot about testing and how useful it could be
in ensuring that the project meets with the client's requirements. 

On the topic of code coverage, having 100% of it in a project does not necessarily mean that the project is bug-free.
100% code coverage simply means that every single line of code has been tested. It doesn't account for all the
possible edge cases that arise from specific paths and input combinations. When it comes to testing, it's advised to
prioritize making high quality tests that cover critical scenarios, as opposed to reaching 100% code coverage using low
quality tests.

Whether or not the new test suite reduces the quality of the code's readability depends on how it is made. If it uses
different naming conventions, then it could lead to confusion and a lack of readability. If it closely mirrors
existing tests, then it could lead to a risk of code duplication.

<h1>Tutorial 2</h1>

<h3>Reflection</h3>

1. The code quality issues detected by PMD were minor issues that required simple fixes. The code scanning brought up 14
issues, almost half of which were issues related to variable naming. I simply changed certain variables to adhere to widely
accepted naming conventions like the camelCase. Another thing that was brought up in the scan was the redundancy of having
public modifiers in an interface. I removed those modifiers to fix the issue.
2. I think the current implementation of CI/CD in this project aligns well with the definition. The workflows effectively maintain a 
standard of code quality by running tests and code scans whenever someone pushes to the repository, aligning with the principles of Continuous Integration.
As for the project's deployment, it is made seamless through the use of automation, exemplifying the essence of 'Continuous' in Continuous Deployment. 