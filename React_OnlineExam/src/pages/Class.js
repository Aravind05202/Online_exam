import { useEffect, useState } from "react";
import "../index.css";

function QuickTest() {
    const [users, setUsers] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch("http://localhost:8080/modify_question")
            .then((response) => {
                if (!response.ok) {
                    throw new Error(`HTTP error! status: ${response.status}`);
                }
                return response.json();
            })
            .then((json) => setUsers(json))
            .catch((error) => {
                console.error("Error fetching data:", error);
                setError(error.message);
            });
    }, []);

    return (
        <div className="App">
            <table className="bp4-html-table modifier">
                <thead>
                    <tr>
                        <th colSpan="2">
                            <h1>Online Exam</h1>
                        </th>
                    </tr>
                    <tr>
                        <th colSpan="2">
                            <h1>Role: Guest</h1>
                        </th>
                    </tr>
                </thead>
                <div className='container'>
                <tbody className="tablebox">
                <th>ClassID</th>
                <th>ClassName</th>
                    {error ? (
                        <tr>
                            <td colSpan="2">Error: {error}</td>
                        </tr>
                    ) : users.length > 0 ? (
                        users.map((user) => (
                            <tr key={user.id}> 
                                <td>{user.id}</td>
                                <td>{user.name}</td>
                            </tr>
                        ))
                    ) : (
                        <tr>
                            <td colSpan="2">No data available</td>
                        </tr>
                    )}
                </tbody>
                </div>
            </table>
        </div>
    );
}

export default QuickTest;
