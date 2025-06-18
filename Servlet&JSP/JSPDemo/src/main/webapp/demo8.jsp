<!--
Creating Custom Tag Library Follows
1. Create a Java Class called Tag Handler which has the logic 
what to be done when this tag exists 
    Here we have created a Java Class "Greet" in a new Package 
called com.rit
2. Create a Tag Library Descriptor file, which tells for what tag 
where the respective class is.
    RClick the project, New->Other->JSP->Tag Library Descriptor, 
it will create a file under WEB-INF folder
    Just add your tag name, tag class & body content
3. Create a JSP File with Taglib Directive along with the attributes 
prefix & uri, and implement the custom created tag.
-->

<%@taglib prefix="rit" uri="WEB-INF/tlds/custom.tld" %>

<html>
    <body>
        <h1> Example for User Defined Tags in Jsp </h1>
        <hr>
        <rit:greet/>
        <hr>
        <rit:greet/>
        <hr>
        <rit:greet/>
        <hr>
        Thank you
    </body>
</html>


