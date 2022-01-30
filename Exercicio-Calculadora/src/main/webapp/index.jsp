<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<link href="style.css" rel="stylesheet">
<title>Calculadora</title>
</head>
<body>
	
    <div class="container" style="margin: 10px 100px;">
        <div class="calculadora" style="height: 100%;">
            <div class="row">
                <div class="titulo col-12">
                    <strong>Calculadora</strong>
                </div>
            </div>
            
             <form method="post" action="MMRProjetoCalculadora">
             	
                <div class="row">
                    <div class="calculo col-12" style="height: 100%;">
                    	<p style="font-size: 16px;">Digite a opção para realizar o calculo:</p>
                    	<div class="selecao">
                    		<select style="color: black; width: 55%; height: 30px; border-radius: 10px; border: 1px solid rgb(253, 253, 253);text-align: center;font-size: 18px; margin-top: 20px;margin-bottom: 20px;" name="opcao">
                                <option style="color: black;" value="adicao">Adição (+)</option>
                                <option style="color: black;" value="subtracao">Subtração (-)</option>
                                <option style="color: black;" value="multiplicacao">Multiplicação (x)</option>
                                <option style="color: black;" value="divisao">Divisão (/)</option>
             			    </select>
                    	</div>
                    	
                        <div class="col-12">Valor 1:</div>
                        <input type="number" name="valor1" value="${requestScope.valor1}"> <br>
                        <div class="col-12">Valor 2:</div>
                        <input type="number" name="valor2" value="${requestScope.valor2}"><br><br><br>
                        <div class="col-12">Resultado:</div>
                        <input type="number" name="resultado" value = "${requestScope.resultado}" disabled="disabled">
    					
                        <div>
                            <button type="reset"  style="background-color: rgb(110, 120, 255);" >Limpar</button>
                            <button type="submit">Calcular</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>