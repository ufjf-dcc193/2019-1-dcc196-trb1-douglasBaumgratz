<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Atividades</h1>
    </div>
    <div class="card-body text-left">
        <a class="btn btn-primary btn-sm" href="atividade_form.html" role="button"><i class="fa fa-plus"
                aria-hidden="true"></i>
        </a><br /><br />

        <table class="table">
            <tr>
                <th>ID</th>
                <th>Título</th>
                <th>Descrição</th>
                <th>Data início</th>
                <th>Data fim</th>
                <th>Ações</th>
            </tr>
            <tr>
                <td>a</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <a class="btn btn-info btn-sm" href="#" role="button">
                        <i class="far fa-edit"></i>
                    </a>
                </td>
            </tr>
        </table>
    </div>
    <div class="card-footer text-muted text-right">
        Atividades
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />