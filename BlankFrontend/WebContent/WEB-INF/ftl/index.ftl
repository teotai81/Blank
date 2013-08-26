<html>
<head><title>AA</title>
<body>
<div id="header">
<H2>
    <a href="http://viralpatel.net"><img height="37" width="236" border="0px" src="http://viralpatel.net/blogs/wp-content/themes/vp/images/logo.png" align="left"/></a>
    FreeMarker Spring MVC Hello World
</H2>
</div>
 
<div id="content">
     
  <fieldset>
    <legend>Add User</legend>
  <form name="user" action="add.html" method="post">
    Username: <input type="text" name="username" /> <br/>
    Password: <input type="text" name="password" />   <br/>
    <input type="submit" value="   Save   " />
  </form>
  </fieldset>
  <br/>
  <table class="datatable">
    <tr>
        <th>username</th>  <th>Password</th>
    </tr>
    <#list model["userList"] as user>
    <tr>
        <td>${user.username}</td> <td>${user.password}</td>
    </tr>
    </#list>
  </table>
 
</div>  
</body>
</html>  