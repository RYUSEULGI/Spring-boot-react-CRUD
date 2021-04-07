import React, { useState } from 'react';
import { useHistory } from 'react-router-dom';
import { userLogin } from '../../api/index';
import '../css/Login.css';

const Login = () => {
    const history = useHistory();
    const [login, setLogin] = useState({});
    const { username, password } = login;

    const handleChange = (e) => {
        const { value, name } = e.target;
        setLogin({
            ...login,
            [name]: value,
        });
    };

    const handleClick = (e) => {
        e.preventDefault();
        const loginRequest = { username, password };

        userLogin(loginRequest)
            .then((res) => {
                console.log(res);
                localStorage.setItem('token', JSON.stringify(res.config.data));
                history.push('/');
            })
            .catch((err) => {
                console.log(err);
                alert('아이디와 비밀번호를 다시 입력해주세요');
            });
    };

    // const activeBtn = password.length >= 8;

    return (
        <form method="post">
            <div className="container">
                <label htmlFor="uname">
                    <b>아이디</b>
                </label>
                <input
                    type="text"
                    placeholder="Enter Username"
                    value={username}
                    name="username"
                    onChange={handleChange}
                    required
                />

                <label htmlFor="psw">
                    <b>비밀번호</b>
                </label>
                <input
                    type="password"
                    placeholder="Enter Password"
                    value={password}
                    name="password"
                    onChange={handleChange}
                    required
                />
                <button onClick={handleClick}>Login</button>
            </div>
        </form>
    );
};

export default Login;
