import React, { useState, useEffect } from 'react';
import { Link, useHistory } from 'react-router-dom';
import CheckLogIn from '../component/CheckLogIn';
import '../css/Home.css';

const Home = () => {
    const history = useHistory();
    const [isloggedin, setIsLoggedIn] = useState({
        isloggedin: false,
    });

    console.log(isloggedin);

    useEffect(() => {
        if (localStorage.getItem('token')) {
            setIsLoggedIn({
                isloggedin: true,
            });
        } else {
            setIsLoggedIn();
        }
    }, []);

    return (
        <div className="container">
            <h1>Main</h1>
            <button onClick={() => history.push('/items/list')}>
                아이템리스트
            </button>
            <Link to="/signup">
                <button>회원가입</button>
            </Link>
            <CheckLogIn isloggedin={isloggedin} />
        </div>
    );
};

export default Home;
