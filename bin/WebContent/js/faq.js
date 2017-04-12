
let showhtml = document.querySelector("._text-inside_faq");
let boxtext = document.querySelector("._box-mini2_faq");
let FlecheBas = document.querySelector("._fleche-bas_faq");
let FlecheHaut = document.querySelector("._fleche-haut_faq");


function togglevisi(item,State) {
    item.style.display = State;
}

togglevisi(showhtml,"none");
togglevisi(FlecheHaut,"none");
togglevisi(boxtext,"none");

FlecheBas.addEventListener("click",function (e) {
    togglevisi(showhtml,"");
    togglevisi(FlecheBas,"none");
    togglevisi(FlecheHaut,"");
    togglevisi(boxtext,"");
});

FlecheHaut.addEventListener("click",function (e) {
    togglevisi(FlecheHaut,"none");
    togglevisi(showhtml,"none");
    togglevisi(FlecheBas,"");
    togglevisi(boxtext,"none");
});






let showhtml2 = document.querySelector("._text-inside_faq2");
let boxtext2 = document.querySelector("._box-mini2_faq2");
let FlecheBas2 = document.querySelector("._fleche-bas_faq2");
let FlecheHaut2 = document.querySelector("._fleche-haut_faq2");




togglevisi(showhtml2,"none");
togglevisi(FlecheHaut2,"none");
togglevisi(boxtext2,"none");

FlecheBas2.addEventListener("click",function (e) {
    togglevisi(showhtml2,"");
    togglevisi(FlecheBas2,"none");
    togglevisi(FlecheHaut2,"");
    togglevisi(boxtext2,"");
});

FlecheHaut2.addEventListener("click",function (e) {
    togglevisi(FlecheHaut2,"none");
    togglevisi(showhtml2,"none");
    togglevisi(FlecheBas2,"");
    togglevisi(boxtext2,"none");
});




let showhtml3 = document.querySelector("._text-inside_faq3");
let boxtext3 = document.querySelector("._box-mini2_faq3");
let FlecheBas3 = document.querySelector("._fleche-bas_faq3");
let FlecheHaut3 = document.querySelector("._fleche-haut_faq3");




togglevisi(showhtml3,"none");
togglevisi(FlecheHaut3,"none");
togglevisi(boxtext3,"none");

FlecheBas3.addEventListener("click",function (e) {
    togglevisi(showhtml3,"");
    togglevisi(FlecheBas3,"none");
    togglevisi(FlecheHaut3,"");
    togglevisi(boxtext3,"");
});

FlecheHaut3.addEventListener("click",function (e) {
    togglevisi(FlecheHaut3,"none");
    togglevisi(showhtml3,"none");
    togglevisi(FlecheBas3,"");
    togglevisi(boxtext3,"none");
});


let showhtml4 = document.querySelector("._text-inside_faq4");
let boxtext4 = document.querySelector("._box-mini2_faq4");
let FlecheBas4 = document.querySelector("._fleche-bas_faq4");
let FlecheHaut4 = document.querySelector("._fleche-haut_faq4");




togglevisi(showhtml4,"none");
togglevisi(FlecheHaut4,"none");
togglevisi(boxtext4,"none");

FlecheBas4.addEventListener("click",function (e) {
    togglevisi(showhtml4,"");
    togglevisi(FlecheBas4,"none");
    togglevisi(FlecheHaut4,"");
    togglevisi(boxtext4,"");
});

FlecheHaut4.addEventListener("click",function (e) {
    togglevisi(FlecheHaut4,"none");
    togglevisi(showhtml4,"none");
    togglevisi(FlecheBas4,"");
    togglevisi(boxtext4,"none");
});

