import React from 'react';
import { Link, useHistory } from 'react-router-dom';

const CheckLogIn = ({ isloggedin }) => {
    const history = useHistory();

    const handleLogout = () => {
        localStorage.removeItem('token');
        alert('로그아웃되었습니다.');
        history.go('/');
    };

    return (
        <>
            {isloggedin ? (
                <button onClick={handleLogout}>로그아웃</button>
            ) : (
                <Link to="/login">
                    {' '}
                    <button>로그인</button>
                </Link>
            )}
        </>
    );
};

export default CheckLogIn;
