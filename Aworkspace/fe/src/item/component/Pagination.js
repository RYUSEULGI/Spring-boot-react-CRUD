import React from 'react';
import '../css/Pagination.css';

const Pagination = ({ paginate, postOnePage, total }) => {
    const pageNum = [];

    for (let i = 1; i <= Math.ceil(total / postOnePage); i++) {
        pageNum.push(i);
    }

    return (
        <>
            {pageNum.map((num) => (
                <span key={num}>
                    <button className="page-btn" onClick={() => paginate(num)}>
                        {num}
                    </button>
                </span>
            ))}
        </>
    );
};

export default Pagination;
