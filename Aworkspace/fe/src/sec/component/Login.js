import avatar from './logo192.png'
import './Login.css'

const Login = () => {
    const url = '#';
    <>
        <form method="post">
            <div className="imgcontainer">
                <img src={avatar} alt="Avatar" className="avatar"/>
            </div>

            <div className="container">
                <label for="uname"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="uname" required/>

                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required/>
                    
                <button type="submit">Login</button>
                <label>
                <input type="checkbox" checked="checked" name="remember"/> Remember me
                </label>
            </div>

            <div className="container" style={{backgroundColor:"#f1f1f1"}}>
                <button type="button" className="cancelbtn">Cancel</button>
                <span className="psw">Forgot <a href={url}>password?</a></span>
            </div>
        </form>
    </>
}

export default Login


