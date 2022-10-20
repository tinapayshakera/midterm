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
    var name = $("#fname1").val();  
    if(name == "") {
      setError("fname1", "Please enter your last name!");
      status = false;
    }else if(name.length < 5) {
      setError("fname1", "Length of name is too short!");
      status = false;
    }else {    
      isValid("fname1");
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
    if(mobile.length != 10) {
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
  
  function passwordIsValid() {  
    var status = true;
    var password =  $("#password").val()  
    var passwordRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})"); 
    
    if (passwordRegex.test(password) == false) {
      //errors.push("Your password must contain at least one letter."); 
      setError("password", "Password must be a minimum of 8 characters including number, Upper, Lower And one special character");
      status = false;
    }else {    
      isValid("password");
    }
    return status;
  }
  
  function cpasswordIsValid() {  
    var status = true;
    var password =  $("#password").val() ;
    var cpassword =  $("#cpassword").val();    
    
    if(cpassword == ""){
      setError("cpassword", "Comfirm password is required!");
      status = false;
    } else if(password != cpassword) {
      setError("cpassword", "Password and comfirm should be not match!");
      status = false;
    }else {
      isValid("cpassword");
      //status = true;
    }  
     return status;
  }
  
  var fields = "#fname, #fname1, #email, #mobile, #password, #cpassword";
  
  $(fields).on('change keyup blur', function() {
      if (allFilled()) {
          $('#submit').removeAttr('disabled');
      } else {
          $('#submit').attr('disabled', 'disabled');
      }
  });
  
  function allFilled() {
      var filled = true;
      var formStatus = nameIsValid() && emailIsValid() && mobileIsValid() && passwordIsValid() && cpasswordIsValid();
      filled = formStatus;  
      return filled;
  }
  
  function validateForm(){  
    var status = true;  
    $("#submit").prop("disabled", true);
    
    var formStatus = nameIsValid() || emailIsValid() || mobileIsValid() || passwordIsValid() || cpasswordIsValid();
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