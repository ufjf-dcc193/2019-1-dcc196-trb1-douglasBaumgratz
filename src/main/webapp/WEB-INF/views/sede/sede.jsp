<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Sedes</h1>
    </div>
    <div class="card-body text-left">
        <a class="btn btn-primary btn-sm" href="sede_form.html" role="button"><i class="fa fa-plus"
                aria-hidden="true"></i>
        </a><br /><br />

        <table class="table">
            <tr>
                <th>Nome Fantasia</th>
                <th>Endereco</th>
                <th>Cidade</th>
                <th>Bairro</th>
                <th>Estado</th>
                <th>Telefone</th>
                <th>Ações</th>
            </tr>

            <c:forEach items="${sede}" var="rep">
                <tr>
                    <td>${rep.getNome_fantasia()}</td>
                    <td>${rep.getEndereco()}</td>
                    <td>${rep.getCidade()}</td>
                    <td>${rep.getBairro()}</td>
                    <td>${rep.getEstado()}</td>
                    <td>${rep.getTelefone()}</td>
                    <td>
                        <a class="btn btn-info btn-sm" href="#" role="button">
                            <i class="far fa-edit"></i>
                        </a>
                        <a class="btn btn-danger btn-sm" href="#" role="button">
                            <i class="far fa-trash-alt"></i>
                        </a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>
    <div class="card-footer text-muted text-right">
        Sedes
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />