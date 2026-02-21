let assignaturasPrimero = ["Llenguatges", "Sistemes", "Programacio"]
assignaturasPrimero.push(prompt("Nova assignatura"))
let assignaturasSegundo = ["Sistemes de Gestio", "Interficies", "Programacio Multimedia"]
assignaturasSegundo.splice(1,1)
let assignatura = prompt("Assignatura que buscar")
    if (assignaturasSegundo.includes(assignatura)) { //.includes revisa el array entero para ver si tiene dentro el valor que pones en el parentesis
        alert("Assignatura "+assignatura+" encontrada.")
    } else {
        alert("Assignatura "+assignatura+" no encontrada")
    }
let assignaturasDAM = [assignaturasPrimero,assignaturasSegundo]
console.log(assignaturasDAM)