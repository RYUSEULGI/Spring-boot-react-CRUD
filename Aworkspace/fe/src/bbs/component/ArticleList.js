import React from 'react'
import './css/ArticleList.css'

const ArticleList = () => (
    <>
        <h2>목록</h2>
        <p>For zebra-striped tables, use the nth-child() selector and add a background-color to all even (or odd) table rows:</p>

        <table>
            <tr>
                <th>작성자</th>
                <th>제목</th>
            </tr>
            <tr>
                <td>Jill</td>
                <td><a href="#"></a>50</td>
            </tr>
            <tr>
                <td>Eve</td>
                <td><a href="#"></a>50</td>
            </tr>
            <tr>
                <td>Adam</td>
                <td><a href="#"></a>50</td>
            </tr>
        </table>
    </>
) 

export default ArticleList