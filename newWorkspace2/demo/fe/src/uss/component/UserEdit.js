import React from 'react'
import './css/Signup.css'

const UserEdit = () => (
    <form style={{border: "1px solid #ccc"}}>
        <div className="container">
            <h1>회원정보 수정</h1>
            <p>Please fill in this form to create an account.</p>
            <hr/>

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required />

            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" required />

            <label for="phoneNumber"><b>Phone Number</b></label>
            <input type="text" placeholder="Phone Number" name="phoneNumber"/>

            <label for="address"><b>Address</b></label>
            <input type="text" placeholder="Address" name="addressr"/>
            
            <label>
                <input type="checkbox" checked="checked" name="remember" style={{marginBottom: "15px"}}/> Remember me
            </label>
            <p>By creating an account you agree to our <a href="#" style={{color:"dodgerblue"}}>Terms & Privacy</a>.</p>

            <div className="clearfix">
                <button type="button" className="cancelbtn">취소</button>
                <button type="submit" className="signupbtn">회원정보수정</button>
            </div>
        </div>
    </form>
)

export default UserEdit