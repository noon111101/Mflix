function sendComment() {
    const user = firebase.auth().currentUser;
    document.getElementById("user_name").value = user.displayName;
    document.getElementById("user_email").value = user.email;
}

