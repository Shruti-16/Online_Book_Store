package com.app.dto;

import java.util.List;

public class ListBookWithUserDTO {
	private UserDTO userDTO;
	private List<ResponseBookDTO> listOfBookDTO;

	public ListBookWithUserDTO() {
		super();
	}

	public ListBookWithUserDTO(UserDTO userDTO, List<ResponseBookDTO> listOfBookDTO) {
		super();
		this.userDTO = userDTO;
		this.listOfBookDTO = listOfBookDTO;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public List<ResponseBookDTO> getListOfBookDTO() {
		return listOfBookDTO;
	}

	public void setListOfBookDTO(List<ResponseBookDTO> listOfBookDTO) {
		this.listOfBookDTO = listOfBookDTO;
	}

}
