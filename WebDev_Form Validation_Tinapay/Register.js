function clearErrors() {
  $(".invalid-feedback").hide();  
  $(".form-control").removeClass("is-invalid"); 
}

function setError(id, error) {
  var ele = $("#"+id).parent(".form-group").find(".invalid-feedback"); 
  ele.show();
  ele.text(error);
  $("#"+id).addClass("is-invalid");  
}

function isValid(id) {
  var ele = $("#"+id).parent(".form-group").find(".invalid-feedback"); 
  ele.hide();
  $("#"+id).removeClass("is-invalid");
  $("#"+id).addClass("is-valid");
}

function nameIsValid() {  
  var status = true;
  var name = $("#fname").val();  
  if(name == "") {
    setError("fname", "Please enter your first name!");
    status = false;
  }else if(name.length < 5) {
    setError("fname", "Length of name is too short!");
    status = false;
  }else {    
    isValid("fname");
  }  
  return status;
}
function nameIsValid() {  
  var status = true;
  var name = $("#lname1").val();  
  if(name == "") {
    setError("lname1", "Please enter your last name!");
    status = false;
  }else if(name.length < 5) {
    setError("lname1", "Length of name is too short!");
    status = false;
  }else {    
    isValid("lname1");
  }  
  return status;
}

function emailIsValid() {  
  var status = true;
  var email = $("#email").val();  
  var emailRegex = /[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/;
  if(email == ""){
    setError("email", "Please enter your email ID!");
    status = false;
  }else if(emailRegex.test(email) == false) {
    setError("email", "Invalid Email Address");
    status = false;
  }else {    
    isValid("email");    
  }  
  return status;
}

function mobileIsValid() { 
  var status = true;
  var mobile = $("#mobile").val();  
  var mobileRegex = /^[6-9]\d{9}$/;
  if(mobile.length != 13) {
    setError("mobile", "Mobile number should be of 11 digit!");
    status = false;
  }else if(mobileRegex.test(mobile) == false) {
    setError("mobile", "Please enter valid 10 digit mobile!");
    status = false;
  }else {    
    isValid("mobile");
  }  
  return status;
}



var fields = "#fname, #fname1, #email, #mobile";

$(fields).on('change keyup blur', function() {
    if (allFilled()) {
        $('#submit').removeAttr('disabled');
    } else {
        $('#submit').attr('disabled', 'disabled');
    }
});

function allFilled() {
    var filled = true;
    var formStatus = nameIsValid() && emailIsValid() && mobileIsValid();
    filled = formStatus;  
    return filled;
}

function validateForm(){  
  var status = true;  
  $("#submit").prop("disabled", true);
  
  var formStatus = nameIsValid() || emailIsValid() || mobileIsValid();
  status = formStatus;  
  return status;
}

$('.alphabat-only').bind('keyup blur', function () {
  var node = $(this);
  node.val(node.val().replace(/[^a-zA-Z\s]/g, ''));
});

$('.numbers-only').bind('keyup blur', function () {
  var node = $(this);
  node.val(node.val().replace(/\D/g, ''));
});

$('.text-numbers-only').bind('keyup blur', function () {
  var node = $(this);
  node.val(node.val().replace(/[^a-zA-Z0-9]/g, ''));
});

$('input').bind('focusout', function () {
  var value = $(this).val().trim();

  //check for type=email and put dummy value in input
  if ($(this).prop('type') === 'email') {
    $(this).val('dummy');
  }

  $(this).val(value);
});

function validateForm() {
    let Check = true;

    if (ValidateDOB() == Check ) {
      alert("SUCCESSFULLY REGISTERED!");
      document.getElementById("myDialog").showModal(); 
    }else{
        alert("Failed to Registered!");
       
        return false
    }
    return true;
  }
  $(function(){
    $('input#btnSubmit'.click(function(){
      document.registrationForm.submit();
    }));
  });
  
    var myInput = document.getElementById("psw");
    var letter = document.getElementById("letter");
    var capital = document.getElementById("capital");
    var number = document.getElementById("number");
    var length = document.getElementById("length");
    
   
    myInput.onfocus = function() {
      document.getElementById("message").style.display = "block";
    }
    
 
    myInput.onblur = function() {
      document.getElementById("message").style.display = "none";
    }
   
    myInput.onkeyup = function() {
    
      var lowerCaseLetters = /[a-z]/g;
      if(myInput.value.match(lowerCaseLetters)) {  
        letter.classList.remove("invalid");
        letter.classList.add("valid");
      } else {
        letter.classList.remove("valid");
        letter.classList.add("invalid");
      }
      
      
      var upperCaseLetters = /[A-Z]/g;
      if(myInput.value.match(upperCaseLetters)) {  
        capital.classList.remove("invalid");
        capital.classList.add("valid");
      } else {
        capital.classList.remove("valid");
        capital.classList.add("invalid");
      }
    
      var numbers = /[0-9]/g;
      if(myInput.value.match(numbers)) {  
        number.classList.remove("invalid");
        number.classList.add("valid");
      } else {
        number.classList.remove("valid");
        number.classList.add("invalid");
      }
  
      if(myInput.value.length >= 8) {
        length.classList.remove("invalid");
        length.classList.add("valid");
      } else {
        length.classList.remove("valid");
        length.classList.add("invalid");
      }
    }
  
  
  
  
  

      function ValidateDOB() {
          var lblError = document.getElementById("lblError");
   
          var dateString = document.getElementById("txtDate").value;
          var regex = /(((0|1)[0-9]|2[0-9]|3[0-1])\/(0[1-9]|1[0-2])\/((19|20)\d\d))$/;
   
         
          if (regex.test(dateString)) {
              var parts = dateString.split("/");
              var dtDOB = new Date(parts[1] + "/" + parts[0] + "/" + parts[2]);
              var dtCurrent = new Date();
              lblError.innerHTML = "Eligibility 18 years ONLY."
              if (dtCurrent.getFullYear() - dtDOB.getFullYear() < 18) {
                  return false;
              }
   
              if (dtCurrent.getFullYear() - dtDOB.getFullYear() == 18) {
   
                 
                  if (dtCurrent.getMonth() < dtDOB.getMonth()) {
                      return false;
                  }
                  if (dtCurrent.getMonth() == dtDOB.getMonth()) {
                    
                      if (dtCurrent.getDate() < dtDOB.getDate()) {
                          return false;
                      }
                  }
              }
              lblError.innerHTML = "";
              return true;
          } else {
              lblError.innerHTML = "Enter date in dd/MM/yyyy format ONLY."
              return false;
          }
      }
