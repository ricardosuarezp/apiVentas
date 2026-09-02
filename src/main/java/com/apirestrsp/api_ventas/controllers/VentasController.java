package com.apirestrsp.api_ventas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestrsp.api_ventas.dto.VentasDetalleRequestDTO;
import com.apirestrsp.api_ventas.dto.VentasDetalleResponseDTO;
import com.apirestrsp.api_ventas.dto.VentasRequestDTO;
import com.apirestrsp.api_ventas.dto.VentasResponseDTO;
import com.apirestrsp.api_ventas.models.Clientes;
import com.apirestrsp.api_ventas.models.Productos;
import com.apirestrsp.api_ventas.models.TipoVenta;
import com.apirestrsp.api_ventas.models.Usuario;
import com.apirestrsp.api_ventas.models.Ventas;
import com.apirestrsp.api_ventas.models.VentasDetalle;
import com.apirestrsp.api_ventas.services.VentasService;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {
    private final VentasService ventasService;

    public VentasController(VentasService ventasService) {
        this.ventasService = ventasService;
    }

    @PostMapping
    public VentasResponseDTO guardarVentas(@RequestBody VentasRequestDTO requestDTO) {

        Ventas nuevaVenta = new Ventas();
        
        // Mapeo de llaves foráneas (Instanciación directa para inserción)
        TipoVenta tipoVenta = new TipoVenta();
        tipoVenta.setIdTipoVenta(requestDTO.getIdTipoVenta());
        nuevaVenta.setIdTipoVenta(tipoVenta);

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(requestDTO.getIdUsuario());
        nuevaVenta.setIdUsuario(usuario);

        Clientes cliente = new Clientes();
        cliente.setIdCliente(requestDTO.getIdClientes());
        nuevaVenta.setIdClientes(cliente);

        // Mapeo de campos de cabecera
        nuevaVenta.setFechaVenta(requestDTO.getFechaVenta());
        nuevaVenta.setMetodoPago(requestDTO.getMetodoPago());
        nuevaVenta.setTotal(requestDTO.getTotal());
        nuevaVenta.setEstado("Activo"); // O asignarlo en el modelo

        // Mapeo de detalles
        if (requestDTO.getVentasDetalles() != null) {
            for (VentasDetalleRequestDTO detReq : requestDTO.getVentasDetalles()) {
                VentasDetalle detalle = new VentasDetalle();
                
                Productos prod = new Productos();
                prod.setIdProducto(detReq.getIdProductos());
                detalle.setIdProductos(prod);
                
                detalle.setCantidad(detReq.getCantidad());
                detalle.setPrecio(detReq.getPrecio());
                detalle.setSubtotal(detReq.getSubtotal());
                
                nuevaVenta.getVentasDetalles().add(detalle);
            }
        }

        Ventas ventaGuardada = ventasService.guardarVentas(nuevaVenta);

        // Mapeo de Salida (Cabecera)
        VentasResponseDTO responseDTO = new VentasResponseDTO();
        responseDTO.setIdVenta(ventaGuardada.getIdVenta());
        responseDTO.setIdTipoVenta(ventaGuardada.getIdTipoVenta().getIdTipoVenta());
        responseDTO.setIdUsuario(ventaGuardada.getIdUsuario().getIdUsuario());
        responseDTO.setIdClientes(ventaGuardada.getIdClientes().getIdCliente());
        responseDTO.setFechaVenta(ventaGuardada.getFechaVenta());
        responseDTO.setEstado(ventaGuardada.getEstado());
        responseDTO.setMetodoPago(ventaGuardada.getMetodoPago());
        responseDTO.setTotal(ventaGuardada.getTotal());

        // Mapeo de Salida (Detalles)
        List<VentasDetalleResponseDTO> listaDetallesResp = new ArrayList<>();
        if (ventaGuardada.getVentasDetalles() != null) {
            for (VentasDetalle detGuardado : ventaGuardada.getVentasDetalles()) {
                VentasDetalleResponseDTO detResp = new VentasDetalleResponseDTO();
                detResp.setIdVentaDetalle(detGuardado.getIdVentaDetalle());
                detResp.setIdProductos(detGuardado.getIdProductos().getIdProducto());
                detResp.setCantidad(detGuardado.getCantidad());
                detResp.setPrecio(detGuardado.getPrecio());
                detResp.setSubtotal(detGuardado.getSubtotal());
                listaDetallesResp.add(detResp);
            }
        }
        responseDTO.setVentasDetalles(listaDetallesResp);

        return responseDTO;
    }
}
