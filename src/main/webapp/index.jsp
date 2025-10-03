<%@page import="tics.itess.Alumnos"%>
<%@ page import="tics.itess.Logro" %>
<%@ page import="tics.itess.Portafolio" %>
<%@ page import="tics.itess.Usuario" %>
<%@ page import="tics.itess.Coordinador" %>
<%@ page import="tics.itess.Familiar" %>
<%
    // Objeto directo
    Logro logro = new Logro(1, "Académico", "Finalizar curso de Java");
    Alumnos alumno = new Alumnos("TI22110032", "IVANY");
    Portafolio portafolio = new Portafolio("Ivany", "Analisis de datos");
    Usuario user = new Usuario("Juanito");
    Coordinador cordi = new Coordinador("Jose", "Sistemas");
    Familiar padre = new Familiar("Hector", "TI22110032");
%>
<html>
<head>
    <title>Prueba Logro</title>
</head>
<body>
    
    
    <h1>Datos del Logro</h1>
    <p>ID: <%= logro.getId() %></p>
    <p>Categoría: <%= logro.getCategoria() %></p>
    <p>Descripción: <%= logro.getDescripcion() %></p>
    
    <h1>Datos del Alumno</h1>
    <p>Num Control: <%= alumno.getNumControl() %></p>
    <p>Nombre: <%= alumno.getNombre() %></p>
    
    <h1>Datos del Portafolio</h1>
    <p>Nombre: <%= portafolio.getNombre() %></p>
    <p>Curso: <%= portafolio.getCurso() %></p>
    
    <h1>Datos del Uusario</h1>
    <p>Nombre: <%= user.getNombre() %></p>
    
    <h1>Datos del Coordinador</h1>
    <p>Nombre: <%= cordi.getNombre() %></p>
    <p>Especializacion: <%= cordi.getEspecializacion() %></p>
    
    <h1>Datos del Familiar</h1>
    <p>Nombre: <%= padre.getNombre() %></p>
    <p>Matricula parentesco: <%= padre.getMatriculaParentesco() %></p>
    
    
    
    
    
    
    
    
    
</body>
</html>
