<html>

<head>
  <title>Insert title here</title>
</head>

<body>
   <h1>WELCOME TO ALIEN H2 DATABASE </h1>
  <h1>Add me here </h1>
   <form action="addAlien">
     <label for="aid">Aid:</label>
     <input type="text" name="aid"><br>
     <label for="name">Name:</label>
     <input type="text" name="name"><br>
     <label for="tech">Tech:</label>
      <input type="text" name="tech"><br>
     <input type="submit"><br>
  </form>
  
  
  <h1>Click below display all </h1>
  
  <form action="getAllAliens">
     <input type="submit" value="FetchAll"><br>
  </form>
  
  
  <h1>Click below to delete all </h1>
  
  <form action="deleteAlienAll">
     <input type="submit" value="DeleteAll"><br>
  </form>
  
  <h1>Delete by Aid </h1>
 
  <form action="deleteById">
      <input type="text" name="id"><br>
     <input type="submit" value="DeleteById"><br>
  </form>
  
  <h1>Search by Aid </h1>
  <form action="getAlien">
      <input type="text" name="aid"><br>
     <input type="submit"><br>
  </form>
  
</body>
</html>