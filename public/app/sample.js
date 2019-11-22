function myFunction() {
    alert("I am an alert box!");
}

function fuck() {
    var localhost = "http://localhost:8080/";
    var url = localhost + "greeting/test";

    var apiJson = fetch(url);
    document.getElementById("demo").innerHTML = apiJson;

}

function greeting() {
    var localhost = "http://localhost:8080/";
    var url = localhost + "greeting/getGreeting";
    // fetch(url).then(res => res.json()).then(resp => {
    //     JSON.stringify(resp);
    //      var json = JSON.parse(resp);
    //
    //     document.getElementById("demo2").innerHTML = json.firstName;
    // });

    fetch(url).then(resp => {
            document.getElementById("demo2").innerHTML = resp.firstName;

    });

    //var apiJson = fetch(url);
    //document.getElementById("demo2").innerHTML = apiJson;
}