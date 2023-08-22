import React, { useRef } from "react";
import { useState, useEffect } from "react";
import { Table, Button, Row,Col } from "reactstrap"
import axios from "axios";
import { toast } from "react-toastify";


function UsersTable() {
    const [users, setUsers] = useState([]);
    //const user=JSON.parse(sessionStorage.getItem('user'));
    //console.log(user);
    let token = sessionStorage.getItem('user');
    const config = {
        headers: { Authorization: `Bearer ${token}` }
    };


    function handleDelete(id) {
        axios.delete(`http://localhost:8080/users/${id}`, config).then(
            (response) => {
                toast.success("User deleted sucessfully!!");
                window.location.reload();
            },
            (error) => {
                toast.error("Server error/insufficient privileges");
            }
        )


    }
    useEffect(() => {
        getAllUsers();
    }, [])

    const getAllUsers = () => {
        axios.get("http://localhost:8080/users", config).then((response) => {
            setUsers(response.data);
            console.log(response.data);
        },
            (error) => {
                toast.error("server down123/unauthorized", { position: "bottom-center" })
            })
    }

    return (
        <div className="user-table admin-page container-fluid">
            <Row className="text-center justify-content-evenly align-items-center">
                <Col className="col-8">
                    <h2 style={{color:"white"}}>All User Accounts</h2>
                <Table responsive className=" border" 
                    size="sm"
                    dark
                    hover
                    striped>
                    <thead>
                        <tr>
                            <td>UserId</td>
                            <td>First Name</td>
                            <td>Last Name</td>
                            <td>Email</td>
                            <td>Mobile Number</td>
                            <td>Registration Date</td>
                            {/* <td>Update User</td> */}
                            <td>Delete User</td>
                        </tr>
                    </thead>
                    <tbody>
                        {users.length > 0 ? users.map((item) =>
                            <tr>
                                <td>{item.id}</td>
                                <td>{item.firstName}</td>
                                <td>{item.lastName}</td>
                                <td>{item.email}</td>
                                <td>{item.mobileNumber}</td>
                                <td>{item.registeredDate}</td>
                                {/* <td><Button  className="button-cool" color="warning">Update</Button></td> */}
                                <td><Button type="Submit" className="button-cool" color="danger" onClick={() => handleDelete(item.id)}>Delete</Button></td>
                            </tr>) : "No Users available"}
                    </tbody>
                </Table>
                </Col>
            </Row>
        </div>
    );
}

export default UsersTable;