import React from 'react'
import axios from 'axios'
import './css/Signup.css'

const Signup = () => {
    const insertMany = () => {
        alert(`dummy data`);
        axios.get(`/auth/insertMany`)
        .then(res => console.log(`${res.data.message} 등록됨`))
        .catch(err => console.log(err));
    }

    return(
        <form style={{border: "1px solid #ccc"}}>
            <div className="container">
                <h1>Sign Up</h1>
                <p>Please fill in this form to create an account.</p>
                <hr/>
        
                <label htmlFor="email"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="email"/>
        
                <label htmlFor="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw"/>
        
                <label htmlFor="psw-repeat"><b>Repeat Password</b></label>
                <input type="password" placeholder="Repeat Password" name="psw-repeat"/>
                
                {/* <label>
                    <input type="checkbox" checked="checked" name="remember" style={{marginBottom: "15px"}}/> Remember me
                </label> */}
                <p>By creating an account you agree to our <a href="#" style={{color:"dodgerblue"}}>Terms & Privacy</a>.</p>
        
                <div className="clearfix">
                    <button type="button" className="cancelbtn">Cancel</button>
                    <button type="submit" className="signupbtn" onClick={insertMany}>Sign Up</button>
                </div>
            </div>
        </form>
    )
}
export default Signup;