<?php

$cliente =new SoapClient('http://localhost:8080/ServicioWeb_Soap2/WSOperaciones?WSDL');

//metodos
$resultado_pago = $cliente -> Saldo([
    "total"=> 1000,
    "pago"=>100
])->return;

if($resultado_pago>=0){
    echo 'Pago Realizado';
}else{
    echo 'dinero insuficiente';
}

