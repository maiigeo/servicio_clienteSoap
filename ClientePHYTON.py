from zeep import Client

cliente= Client('http://localhost:8080/ServicioWeb_Soap2/WSOperaciones?WSDL')

if cliente.service.Login("Marilyn","maii"):
    print("credenciales correctas")
else:
    print("credenciales incorrectas")


if cliente.service.saldo(5000,9000)>=0:
    print("Pago realizado con exito")
else:
    print("No tiene suficiente dinero")